package com.theagilemonkeys.meets.magento.methods;

import com.theagilemonkeys.meets.magento.SoapApiMethod;
import com.theagilemonkeys.meets.magento.models.MageMeetsCart;
import com.theagilemonkeys.meets.models.base.MeetsFactory;

/**
 * Android Meets SDK
 * Original work Copyright (c) 2014 [TheAgileMonkeys]
 *
 * @author Álvaro López Espinosa
 */
public class ShoppingCartInfo extends SoapApiMethod {
    public ShoppingCartInfo() {
        super(MeetsFactory.get().makeCart().getClass());
    }
}

