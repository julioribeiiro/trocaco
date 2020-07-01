from datetime import datetime
from firebase import firebase
import json
import os
import lcddriver
import time
from functools import partial
import RPi.GPIO as GPIO
from time import sleep
GPIO.setmode(GPIO.BCM)

#GPIO Pin of Component
buttonPinesq = 24
buttonPinmeio = 17
buttonPindir = 23

i = 0
display = lcddriver.lcd()

#initialization
GPIO.setup(buttonPinesq, GPIO.IN, pull_up_down=GPIO.PUD_UP)
GPIO.setup(buttonPindir, GPIO.IN, pull_up_down=GPIO.PUD_UP)
GPIO.setup(buttonPinmeio, GPIO.IN, pull_up_down=GPIO.PUD_UP)

buttonPressesq = True
buttonPressmeio = True
buttonPressdir = True


#configuration of firebase
URL_Firebase = 'https://gerdau-2df3f.firebaseio.com/'

firebase = firebase.FirebaseApplication(URL_Firebase, None)

#function to send button data
def envia_botao(buttonPress, num) :
    global firebase

    data_atual = datetime.now()
    data_hora = data_atual.strftime("%d/%m/%Y  %H:%M:%S")
    dados_firebase = {"num": num, "tag": buttonPress, "data": data_hora}
    firebase.post('/botao', dados_firebase)
    print ( "TAG enviada para o Firebase")
    return

def fetch_botao() :
    global i
    i = 1
    time.sleep(1)
    name = firebase.get('/perguntas/{0}'.format(i), None)
    long_string(display, "{0}".format(name), 1) # Write line of text to first line of display
    time.sleep(2)
    display.lcd_clear()
    if buttonPressmeio == False:
            i = i + 1
            long_string(display, "Carregando resposta...", 1)
            time.sleep(2)
            sleep(2)
            display.lcd_clear()
            name = firebase.get('/perguntas/{0}'.format(i), None)
            long_string(display, "{0}".format(name), 1)
            time.sleep(2)
            sleep(2)
            envia_botao(buttonPressmeio, 3)
            sleep(1)
            display.lcd_clear()
            long_string(display, "Muito obrigado pela sua contribuicao!!", 1)

    return

def long_string(display, text = '', num_line = 1, num_cols = 16):
	
        if(len(text) > num_cols):
            display.lcd_display_string(text[:num_cols],num_line)
            time.sleep(1)
            for i in range(len(text) - num_cols + 1):
                text_to_print = text[i:i+num_cols]
                display.lcd_display_string(text_to_print,num_line)
                time.sleep(0.2)
            time.sleep(1)
        else:
            display.lcd_display_string(text,num_line)
    
GPIO.setwarnings(False)
try:
    
    while True:
        fetch_botao()                                 
        buttonPressesq = GPIO.input(buttonPinesq)
        buttonPressdir = GPIO.input(buttonPindir)
        buttonPressmeio = GPIO.input(buttonPinmeio)
        #implementacao de todos os botoes suspensa para foco no registro de tempo
        #what means each button press
        #if buttonPressesq == False:
        #    print("1 - Item da esquerda...")
        #   envia_botao(buttonPressesq, 1)
        #    sleep(1)
        #if buttonPressdir == False:
        #   print("2 - Item da direita...")
        #  envia_botao(buttonPressdir, 2)
        # sleep(1)
        #if buttonPressmeio == False:
        #   print("3 - Selecionando item...")
        #  envia_botao(buttonPressmeio, 3)
        # sleep(1)
        
except KeyboardInterrupt: # If there is a KeyboardInterrupt (when you press ctrl+c), exit the program and cleanup
    print("Cleaning up!")
    display.lcd_clear()
finally:
    GPIO.cleanup()
