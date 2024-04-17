package toledo.luis.recycler

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val clasesDofus = listOf(
            ClaseDofus(R.drawable.anutrof, nombre = "Anutrof", descripcion = "¡Los Anutrofs son unos impenitentes Cazadores de tesoros! Cualquier producto, objeto o criatura les interesa siempre y cuando puedan conseguir kamas a cambio.", dios = "Anutrof", tipo = "Cazadores de Tesoros", especialidad = "Encontrar Tesoros"),
            ClaseDofus(R.drawable.osamodas, nombre = "Osamodas", descripcion = "¡Los Osamodas son Invocadores natos! Tienen el poder de invocar criaturas y resultan ser excelentes domadores.", dios = "Osamodas", tipo = "Invocador", especialidad = "Invocar"),
            ClaseDofus(R.drawable.zobal, nombre = "Zobal", descripcion = " Este guerrero de múltiples facetas se puede adaptar a todas las situaciones. Obtiene su poder de la máscara que lleve puesta, así que puede cambiar de técnica de combate con solo cambiar de máscara. ", dios = "Sadida", tipo = "Guardianes", especialidad = "Llevar mascaras"),
            ClaseDofus(R.drawable.roublard, nombre = "Tymador", descripcion = "Los tymadores son estrategas que se dedican a poner bombas, pero eso ya lo sabemos todos. Usan la pólvora explosiva como nadie, y cuando se trata de hacer explotar a sus enemigos, no se hacen de rogar.", dios = "Rodamyt", tipo = "Manipulador de Bombas", especialidad = "Manipular Explosivos"),

        )

        val recycler_clases_dofus:RecyclerView = findViewById<RecyclerView>(R.id.lista_view)
        recycler_clases_dofus.layoutManager = LinearLayoutManager(this)
        recycler_clases_dofus.adapter = AdaptadorClaseDofus(clasesDofus)





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}