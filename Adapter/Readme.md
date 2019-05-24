Adapter.

En esta version de Engineer War se implementa el patron Adapter, en el cual tomamos el proyecto de otro grupo y se sustrajo uno de sus personajes (El Orco en este caso) y se implementó en nuestro juego, el metodo adaptado fue el de "Atacar" que es la accion que ejecuta el orco, contrario al accionar de nuestros personajes, llamado "Ingeniar", una vez adaptado el metodo "Atacar", el Orco 
respondia al llamado de "Ingeniar" sin afectar su funcionalidad en nuestro programa.

Este nuevo patron de diseño se implementó en el paquete logica.Adapter, que cuenta con una única clase llamda Adapter que toma los elementos y atributos del personaje Orco y los implementa a nuestras instancias del constructor, donde se construyen los articulos del personaje y al personaje.



