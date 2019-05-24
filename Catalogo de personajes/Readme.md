Abstract Factory Pattern.

En esta versión de Engineer War se ve únicamente implementado el patrón de diseño Abstract Factory, de tal manera que los personajes del juego (Ingeniero de Sistemas - Ingeniero Eléctrico - Ingeniero Civil) al ser seleccionados se podrán ver los artículos o implementos que utiliza cada uno en el juego, pero nada más como un catálogo, como la versión del juego lo específica, únicamente se pueden ver los productos de cada fabrica(Ingenieros) a manera de pre-visualización de cada artículo por separado, con su nombre, una breve descripción de este, una imagen y su propósito de manera muy superficial.

Dicho proceso se puede ver desde el metodo logica.abstractFactory.factories y logica.abstractfactory.products, en el primer paquete(logica.AbstractFactory.factories) nos encontramos primero con la interfaz AbstractFactory que crea las instancias de los articulos que va a poseer cada ingeniero(una Herramienta, un Accesorio, y un vehiculo), y, en el mismo paquete encontramos las clases de los ingeniero, cada clase representa a un ingeniero y por ende a una fabrica especifica, y su objetivo es el de crear los productos que corresponden a cada ingeniero.

En el segundo paquete (logica.abstractfactory.products) encontramos los productos de cada ingeniero, separados por clases, en las cuales se crea el producto solicitado por las fabricas.
