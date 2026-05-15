package com.vortex.mervitchop.interfaces;

import com.example.fooddeliveryapplication.Model.CartInfo;

import java.util.ArrayList;

public interface IAdapterItemListener {
    void onCheckedItemCountChanged(int count, long price, ArrayList<CartInfo> selectedItems);
    void onAddClicked();
    void onSubtractClicked();
    void onDeleteProduct();
}