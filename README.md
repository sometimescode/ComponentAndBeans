# ComponentAndBeans
Testing Component and Beans of Struts2

Notes:
1. The current directory where the component (comp.jsp) is found is the default directory that Struts2 uses. You can change the defaults by configuring struts.xml or using a struts properties file, but I haven't tried.
2. It's important that the java file for the Bean has a 0 argument constructor because that is what gets called when you create the bean. I initially had no constructor
and placed important logic in execute() but it didn't run.
