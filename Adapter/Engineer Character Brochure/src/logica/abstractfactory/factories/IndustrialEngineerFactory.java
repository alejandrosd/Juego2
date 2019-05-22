package logica.abstractfactory.factories;

import logica.abstractfactory.products.Body;
import logica.abstractfactory.products.IndustrialEngineerBody;
import logica.abstractfactory.products.IndustrialEngineerWeapon;
import logica.abstractfactory.products.Weapon;

/**
 *
 * @author David Bohorquez
 */
public class IndustrialEngineerFactory implements AbstractFactory {

    @Override
    public Body createBody() {
        return new IndustrialEngineerBody();
    }

    @Override
    public Weapon createWeapon() {
        return new IndustrialEngineerWeapon();
    }

}
