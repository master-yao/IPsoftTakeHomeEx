# IPsoftTakeHomeEx

1.clone this repository to local
2.open eclipse
3.import git project in existing local repository
4.convert to maven project
5.run whenVisitingWikipedia.java file as JUnit test
Then it should work.

Actually, I cannot have it running on my machine.
Since this is my first time using serenity, I referred to Serenity official website tutorial video and document introduction.
After reviewing the video, the business logic behind this problem is clear and not very complex.
1.simulating browser opening wiki homepage.
2.finding "English" language category.
3.simulating click on it.
4.finding the position where welcome words locate.
5.checking whether it is English.

To be honest, I learned a lot from this tutorial process. This coding process took me around 30 minutes.
However, my test can not be running. 
The problems I met were:
Exception: "Could not instantiate class org.openqa.selenium.firefox.FirefoxDriver."
Exception: "Unable to connect to host 127.0.0.1 on port 7055 after 45000 ms." 

So I tried 
1.update different selenium's version in maven
2.try different version of firefox
3.try other browsers


I took me 3-4 hours on it and I still cannot solve it. I downloaded the introduction source code from official website. 
That TodoApp still can not work correctly on my machine.
So I am not giving up this problem, I am just wondering if you can help me with this issue.

Thanks for reading.



