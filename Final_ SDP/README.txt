Description:
This project for a cake shop is used to take orders from customers. The customer should choose the cake by answering questions. At the end order will be taken and the message of successful ordering will be outputted.
Design patterns:
There are used patterns like State, Adapter, Template, Decorator, Observer, Strategy. 
1. State pattern is used to show the status of the shop. Shop is open from Monday to Friday and on Saturday and Sunday it is closed. At the beginning if the current day is Saturday or Sunday then there will be a message that the shop is closed and information when it is open. 
2. Adapter pattern is used to notify that order is delivered. Here we implemented from Observer interface update() method and used method sent() 
3. Template pattern is used to make a template of cake and use methods in other classes of cake types. 
4. Decorator pattern is used to add decoration to chosen cake. There are 3 types of decoration and their costs.
5.  Observer pattern is used  to notify the date of delivery.
6. Strategy pattern is used to show information about order like cake, cost, client who ordered it and date of delivery. 
Use-study:
At the beginning if the current day is Saturday or Sunday then there will be a message that the shop is closed and information when it is open.In addition, the program will terminate. Otherwise, the program will greet and ask questions about choosing cake. 
Questions:
1. What is your name?
(Client will write the name)
2. Please, choose a cake:
3. (There are variants like: 
1)Cheese cake
2)Chocolate cake
3)Honey cake
and client will choose the number of cake)
4. The ingredients of the chosen cake will be outputted.
5. The list of decorations will be outputted with prices and total price.
6. Please,Choose the date 
(Here the client should choose the date of delivery like “21-11-2021” and the check will be outputted.)
7. Do you agree with your order?(yes/no)
(If client choose yes then the check will be outputted, otherwise the program will terminate)
8. Thank you for choosing us! The order is delivered