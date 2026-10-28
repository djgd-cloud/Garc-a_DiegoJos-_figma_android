package es.medac.diegogarcia.garcia_diegojose_figma_android;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import androidx.recyclerview.widget.GridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class ProductoAdapter
        extends RecyclerView.Adapter<ProductoAdapter.ProductoViewHolder> {

    private final List<Producto> productos;

    public ProductoAdapter(List<Producto> productos) {
        this.productos = productos;
    }

    @NonNull
    @Override
    public ProductoViewHolder onCreateViewHolder(
            
            @NonNull ViewGroup parent, int viewType) {

        View vista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_producto, parent, false);

        return new ProductoViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(
            @NonNull ProductoViewHolder holder, int position) {

        Producto producto = productos.get(position);

        holder.nombre.setText(producto.getNombre());
        holder.precio.setText(producto.getPrecio());
        holder.imagen.setImageResource(producto.getImagen());
        holder.imagen.setContentDescription(producto.getNombre());
    }

    @Override
    public int getItemCount() {
        return productos.size();
    }

    static class ProductoViewHolder extends RecyclerView.ViewHolder {

        ImageView imagen;
        TextView nombre;
        TextView precio;

        public ProductoViewHolder(@NonNull View itemView) {
            super(itemView);

            imagen = itemView.findViewById(R.id.iv_producto);
            nombre = itemView.findViewById(R.id.tv_nombre_producto);
            precio = itemView.findViewById(R.id.tv_precio_producto);
        }
    }
}
