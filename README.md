# What is J2HTML

This is custom library made purely in core java to make html pages without touching html and only using core java, for projects that require dymanically made html pages , as it is made in core java you can integrate it with any type of projects, be it EE, Embedded Systems ,Spring ,Java FX,Swing or any framework

## What is under the hood

This project uses inbuilt java FileOutputStream to create the html pages and html is created as String , so you can also disable it and use where you want to dynamically send html eg. Email etc , All the tags are made as an object following a simple pattern , so you can easily create your custom re-usable tags , few examples of custom tags are provided inside project , 


## Where should you use this ? 
The project should be used  where you don't want to bugged with heavy frameworks, and just want quick html creation based upon criterial, eg: firing  mutiple threads with different html 'which are looks good without much work 
## How is styling done for html ?
CSS styling is done, using external property file, and uses inline Tags for styling ,other then that we are currently implementing themes ,which can be easily changed

# Example Snippets


## Following is how you can create a Table easily without worrying about tags

![image](https://user-images.githubusercontent.com/83908274/176640273-b2cbdc4b-982d-45c6-9d62-d6037d79da24.png)

## This is how you can make the list 

![image](https://user-images.githubusercontent.com/83908274/176643958-5cc428bc-cde7-4bf7-a0e8-93d00ddd2755.png)

## Creating custom re-usable tags
![image](https://user-images.githubusercontent.com/83908274/176644682-8dbdb2c0-a8ee-4de1-837b-7f97fa4496fc.png)

## Result

![image](https://user-images.githubusercontent.com/83908274/176645256-9df46445-9783-4035-81e2-3606481ace48.png)

