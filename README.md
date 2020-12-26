# COVID SMS SENDER
******************

### WHY I MADE THIS? 
It is supposed to help my grandmother, in India, know (through SMS) if it would be relatively safe to come out of the house for any (and only) ESSENTIAL travel during COVID times. 

### THE THEORY BEHIND THIS?
So my idea was that if the COVID numbers for that day in the area go down, the area is relatively safe, and there is a lower chance of my granny and her friends getting COVID. This is quite a naive theory on second thought, but it does work to some extent!

### LIMITATIONS?
1) The first limitation of this app is it provides COVID numbers for the state (Maharashtra), and not the city (Mumbai). So, a rise in state-wide stats doesn't necessarily amount to more infected people in Mumbai.
2) The numbers for the first 2-3 days of use were quite accurate, but after that, a lot of the fields like `infectedChange` stopped working (API provider malfunction). I wanted to switch to a better service, but didn't find any. So, stay tuned for the web scraping functionality that gets covid stats for a given location.

### NEXT GOAL?
1) Get COVID stats through web scraping
2) Build my own word processing functionality, which generates an image with text on it by actually processing images and not using external image editing libraries

### WAS THIS SUCCESSFUL?
In my opinion, it was successful for the first 2-3 days, and my grandma was actually using it, and even asked me to send these messages to her friends. A few hours later, the API stopped functioning properly, and our neighbours volunteered to do the essential stuff for her (we live in a different country and couldn't go back due to travel ban)! So, I had to close off the SMS sending part. But I still want to extend upon what I have done just as a proof of concept!

##### WHY SMS?
I had a few options in mind, email, sms, imessage, and postcard (joke). Email is tough to use and access from a senior citizens perspective (not my opinion). iMessage is an ok candidate, but few APIs exist and wouldn't work if I have to send them to my granny's friends' android phones. A postcard with COVID updates would reach only after COVID. SMS is quick, easy to access, cross-platform and comes at a cheap cost.

##### WHAT CAN I DO WITH THIS?
Whatever you want. Use it for your family members! `Safe grandma = Happy grandson`! Just make sure to purchase your own API key from textlocal and use it in the `SMS.java` file (ONLY FOR INDIAN CITIZENS). For Non-Indians, please look at other SMS APIs like reson8 and substitute their code in the `SMS.java` file.

##### MY GRANDMAS OPINION ON THIS?
> Its good :) - SK

#### Thank you for reading!
