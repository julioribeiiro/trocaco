  import datetime
from firebase import firebase
import json
import os
from functools import partial
import RPi.GPIO as GPIO
from time import sleep
GPIO.setmode(GPIO.BCM)

#GPIO Pin of Component
buttonPinesq = 24
buttonPinmeio = 17
buttonPindir = 23

#inicializa
GPIO.setup(buttonPinesq, GPIO.IN, pull_up_down=GPIO.PUD_UP)
GPIO.setup(buttonPindir, GPIO.IN, pull_up_down=GPIO.PUD_UP)
GPIO.setup(buttonPinmeio, GPIO.IN, pull_up_down=GPIO.PUD_UP)

buttonPressesq = True
buttonPressmeio = True
buttonPressdir = True


#configuracao do firebase
URL_Firebase = 'https://gerdau-2df3f.firebaseio.com/'

firebase = firebase.FirebaseApplication(URL_Firebase, None)

#funcao para enviar dado do botao
def envia_botao(num, buttonPress) :
    global firebase

    data_hora = datetime.datetime.now()
    dados_firebase = {"TAG": buttonPress, "NUM": num, "Data_Hora": data_hora}
    firebase.post('/ButtonPressed', dados_firebase)
    return

GPIO.setwarnings(False)
try:
    while True:
        buttonPressesq = GPIO.input(buttonPinesq)
        buttonPressdir = GPIO.input(buttonPindir)
        buttonPressmeio = GPIO.input(buttonPinmeio)
        if buttonPressesq == False:
            print("1 - Item da esquerda...")
            envia_botao(1, buttonPressesq)
            sleep(1)
        if buttonPressdir == False:
            print("2 - Item da direita...")
            envia_botao(2,buttonPressdir)
            sleep(1)
        if buttonPressmeio == False:
            print("3 - Selecionando item...")
            envia_botao(3, buttonPressmeio)
            sleep(1)
finally:
    GPIO.cleanup()
