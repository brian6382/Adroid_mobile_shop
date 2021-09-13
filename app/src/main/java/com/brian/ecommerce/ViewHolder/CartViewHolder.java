package com.brian.ecommerce.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.brian.ecommerce.Interface.ItemClickListner;
import com.brian.ecommerce.R;

public class CartViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView txtProductName, txtProductPrice, txtProductQuantity;
    private ItemClickListner itemClickListner;



    public CartViewHolder(@NonNull View itemView) {
        super(itemView);
        txtProductQuantity = itemView.findViewById(R.id.cart_product_quantity);
        txtProductPrice = itemView.findViewById(R.id.cart_product_price);
        txtProductName = itemView.findViewById(R.id.cart_product_name);


    }

    @Override
    public void onClick(View view) {
        itemClickListner.onClick(view,getAdapterPosition(),false);

    }

    public void setItemClickListner(ItemClickListner itemClickListner) {
        this.itemClickListner = itemClickListner;
    }
}
