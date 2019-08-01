#!/usr/bin/env python
#-*- coding: utf-8 -*-
import os
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import selenium.webdriver.support.ui as ui
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
import time
# get the path of ChromeDriverServer
dir = os.path.dirname(__file__)
chrome_driver_path = "/Users/MatthewGerat/Desktop/everything/bot/chromedriver"

#This was my first project that I strayed away from the class curriculum and wanted to try on my own. I always saw people
#creating and selling bots or scripts to purchase clothing/shoes automatically. I wanted to make one for a brand I
#often would purchase. I had no prior knowledge of selenium until I began researching some ways to control web pages.
#After I found selenium I began to play around and see what I could come up with. I was able to inspect element
#and read through the code on Supreme's website to see what different attributes were named. From there I was
#able to actually get a working script that could load the page, select the category, find the item by name,
#select size and color, add to cart, proceed to checkout, then finally enter in my payment/shipping details.
#I was not able to find a way around captcha so I would have to manually complete the captcha myself.
#Since this script was never shared with anyone, before running, I would hard code the item details,
#payment, shipping, etc. 

# create a new Chrome session
driver = webdriver.Chrome(chrome_driver_path)
driver.implicitly_wait(30)
driver.maximize_window()

# navigate to the application home page
driver.get("http://www.supremenewyork.com/shop/all/")



# get the search textbox
#Selects category
driver.find_element_by_xpath("//a[@href='/shop/all/tops_sweaters']").click()
#Selects item

#driver.find_element_by_link_text('Supreme/Schott® Leopard Lined Leather Work Jacket').click()
# item = WebDriverWait(driver, 2).until(
#     EC.element_to_be_clickable((By.PARTIAL_LINK_TEXT, 'Leopard Lined Leather Work Jacket'))
# )
driver.find_element_by_partial_link_text('Bandana Sweater').click()
#time.sleep(1)
driver.find_element_by_xpath("//a[@data-style-name='Orange']").click()

# item.click()



#Selects Size


time.sleep(1)
driver.find_element_by_xpath("//select[@name='s']/option[text()='Large']").click()
driver.implicitly_wait(30)


driver.implicitly_wait(30)

#Attempt to add and check out
driver.find_element_by_name('commit').click()
wait = ui.WebDriverWait(driver, 7).until(EC.element_to_be_clickable((By.ID, "cart")))
driver.find_element_by_xpath("//a[@href='https://www.supremenewyork.com/checkout']").click()

#Checkout AutoFill
#Name
billingName = driver.find_element_by_name("order[billing_name]")
billingName.send_keys('Matthew Gerat')

#email
email = driver.find_element_by_name("order[email]")
email.send_keys("mdgerat@fakeemail.com")

#Phone
phoneNumber = driver.find_element_by_name("order[tel]")
wait = ui.WebDriverWait(driver, 1)
phoneNumber.send_keys("8154445555")

#billing
billingAddress = driver.find_element_by_name('order[billing_address]')
billingAddress.send_keys("123 Smith Lane")

#zipcode
zipcode = driver.find_element_by_name('order[billing_zip]')
zipcode.send_keys("65423")

#city
city = driver.find_element_by_name('order[billing_city]')
city.send_keys("Joliet")

#select state
#driver.find_element_by_xpath("//select[@name='order[billing_state']/option[text()='IL']").click()


#Credit Card
creditCard = driver.find_element_by_id('cnb')
creditCard.send_keys("4266841488888888")
time.sleep(.5)
#Experiation date
driver.find_element_by_xpath("//select[@name='credit_card[month]']/option[text()='88']").click()
driver.find_element_by_xpath("//select[@name='credit_card[year]']/option[text()='2019']").click()
#CVV
cvv = driver.find_element_by_name('credit_card[vval]')
cvv.send_keys("88")
