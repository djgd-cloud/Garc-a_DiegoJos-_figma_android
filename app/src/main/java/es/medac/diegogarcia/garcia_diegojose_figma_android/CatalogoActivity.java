package es.medac.diegogarcia.garcia_diegojose_figma_android;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;

import java.util.ArrayList;
import java.util.List;



public class CatalogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_catalogo);

        RecyclerView recyclerView = findViewById(R.id.rv_productos);

        recyclerView.setLayoutManager(
                new GridLayoutManager(this, 2)
        );

        List<Producto> productos = new ArrayList<>();

// Pijama dibujos
        productos.add(new Producto(
                getString(R.string.pijama_dibujos),
                getString(R.string.precio_pijama_dibujos),
                R.drawable.img_pijama_dibujos
        ));

// Chándal Spotify
        productos.add(new Producto(
                getString(R.string.chandal_spoti),
                getString(R.string.precio_spoti),
                R.drawable.img_chandal_spotify
        ));

// Pijama azul
        productos.add(new Producto(
                getString(R.string.pijama),
                getString(R.string.precio_pijama),
                R.drawable.img_pijama
        ));

// Blusa
        productos.add(new Producto(
                getString(R.string.nombre_blusa),
                getString(R.string.precio_blusa),
                R.drawable.img_blusa
        ));

// Conectar la lista con el RecyclerView
        ProductoAdapter adapter = new ProductoAdapter(productos);
        recyclerView.setAdapter(adapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}