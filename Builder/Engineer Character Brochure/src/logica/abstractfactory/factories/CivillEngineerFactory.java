package logica.abstractfactory.factories;

import logica.abstractfactory.products.CivilEngineerClothe;
import logica.abstractfactory.products.CivilEngineerTool;
import logica.abstractfactory.products.CivilEngineerVehicle;
import logica.abstractfactory.products.Clothe;
import logica.abstractfactory.products.Tool;
import logica.abstractfactory.products.Vehicle;

/**
 *
 * @author David Bohorquez
 */
public class CivillEngineerFactory implements AbstractFactory {

    @Override
    public Clothe createBody() {
        return new CivilEngineerClothe();
    }

    @Override
    public Tool createWeapon() {
        return new CivilEngineerTool();
    }

    @Override
    public Vehicle createVehicle() {
        return new CivilEngineerVehicle();
    }

}
