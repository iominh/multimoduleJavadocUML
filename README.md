This example demonstrates how to generate Javadoc UML across multiple Maven modules.

Prerequisites
=============
* Maven 2.2.1 or higher

* [yWorks UML Doclet](http://www.yworks.com/en/products_ydoc.html#download)


Install Guide
=====
* Download [yWorks UML Doclet](http://www.yworks.com/en/products_ydoc.html#download) and extract
it to a directory.

* Set an environment variable YWORKS_HOME to point to the extracted directory.

Usage
=====
* Build the project and execute:

        mvn clean install site
        
