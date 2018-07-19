from tkinter import*
from tkinter import filedialog
import cv2

'''def fun1():
    print("Its Working")
def resize():
    print("Its working")
    win.geometry("200x300")
def default():
    print("Its working")
    win.geometry("400x500")
'''
def convert():
    global filename
    global tt
    img = cv2.imread(filename)
    if tt == "jpg":
        
        cv2.imwrite("output_new_go.jpg", img)
        lb4.config(text="Converted Successfully")
    elif tt == "bmp":
        
        cv2.imwrite("output_new_go.bmp", img)
        lb4.config(text="Converted Successfully")
    elif tt == "pbm":
        
        cv2.imwrite("output_new_go.pbm", img)
        lb4.config(text="Converted Successfully")
    elif tt == "pgm":
        
        cv2.imwrite("output_new_go.pgm", img)
        lb4.config(text="Converted Successfully")
    elif tt == "ppm":
        
        cv2.imwrite("output_new_go.ppm", img)
        lb4.config(text="Converted Successfully")
    elif tt == "sr":
        
        cv2.imwrite("output_new_go.sr", img)
        lb4.config(text="Converted Successfully") 
    elif tt == "ras":
        
        cv2.imwrite("output_new_go.ras", img)
        lb4.config(text="Converted Successfully")
    elif tt == "jpe":
        
        cv2.imwrite("output_new_go.jpe", img)
        lb4.config(text="Converted Successfully") 
    elif tt == "jp2":
        
        cv2.imwrite("output_new_go.jp2", img)
        lb4.config(text="Converted Successfully")
    elif tt == "tiff":
        
        cv2.imwrite("output_new_go.tiff", img)
        lb4.config(text="Converted Successfully")
    elif tt == "tif":
        
        cv2.imwrite("output_new_go.tif", img)
        lb4.config(text="Converted Successfully")
    elif tt == "png":
        
        cv2.imwrite("output_new_go.png", img)
        lb4.config(text="Converted Successfully")
    elif tt == "jpeg":
        
        cv2.imwrite("output_new_go.jpeg", img)
        lb4.config(text="Converted Successfully") 
    else:
        lb4.config(text = "Does not support yet")
        
    
    
    
def browsefunc():
    global filename
    filename = filedialog.askopenfilename(filetypes = (("image","*.png"),("all","*.*")))
    
    lb2.config(text=filename)
    
 #   img = cv2.imread(filename)
  #  cv2.imwrite("output.jpg", img)

win = Tk()
win.geometry("600x500")


tkVar = StringVar()
choices = {'png', 'jpg','pgp','jpeg','bmp','pbm','pgm','ppm','sr','ras','jpe','jp2','tiff','tif'}
tkVar.set('.format')
popupMenu = OptionMenu(win, tkVar, *choices)

def change_dropdown(*args):
    global tt
    tt = tkVar.get()

tkVar.trace('w', change_dropdown)



lb0 = Label(width = 90,height = 3,bg = "white")
lb0.grid(row = 0, column =0, columnspan = 2)
add = Button(win, text = "Add File", command = browsefunc,height = 2, width = 20)
add.grid(row = 1, column = 0, sticky = E)
lb1 = Label(width = 90,height = 3,bg = "white")
lb1.grid(row = 2, column = 0, columnspan = 2)
lb2 = Label(width = 90,height = 3)
lb2.grid(row = 3, column = 0, columnspan = 2)
lb3 = Label(width = 90,height = 3,bg = "white")
lb3.grid(row = 4, column = 0, columnspan = 2)
add = Button(win, text = "Convert", command = convert,height = 2, width = 20)
add.grid(row = 5, column = 0, sticky = E)
popupMenu.grid(row = 5, column = 1, sticky = W)
lb4 = Label(width = 90,height = 3)
lb4.grid(row = 6, column = 0, columnspan = 2)
