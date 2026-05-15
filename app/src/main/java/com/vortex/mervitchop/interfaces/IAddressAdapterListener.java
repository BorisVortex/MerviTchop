package com.vortex.mervitchop.interfaces;

import com.example.fooddeliveryapplication.Model.Address;

public interface IAddressAdapterListener {
    void onCheckedChanged(Address selectedAddress);
    void onDeleteAddress();
}
