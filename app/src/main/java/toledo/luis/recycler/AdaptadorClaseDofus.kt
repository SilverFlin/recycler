package toledo.luis.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorClaseDofus(val clases_dofus_list: List<ClaseDofus>): RecyclerView.Adapter<AdaptadorClaseDofus.ClaseDofusViewHolder>() {
    class ClaseDofusViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var imagen_clase: ImageView = itemView.findViewById(R.id.imagen_clase)
        var nombre_clase: TextView = itemView.findViewById(R.id.nombre_clase)
        var descripcion_clase: TextView = itemView.findViewById(R.id.descripcion_clase)
        var dios_clase: TextView = itemView.findViewById(R.id.dios_clase)
        var tipo_clase: TextView = itemView.findViewById(R.id.tipo_clase)
        var especialidad_clase: TextView = itemView.findViewById(R.id.especialidad_clase)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClaseDofusViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.lista_item, parent, false)
        return ClaseDofusViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return clases_dofus_list.size
    }

    override fun onBindViewHolder(holder: ClaseDofusViewHolder, position: Int) {
        val claseDofus: ClaseDofus = clases_dofus_list[position]

        holder.imagen_clase.setImageResource(claseDofus.imagen)
        holder.nombre_clase.text = claseDofus.nombre
        holder.descripcion_clase.text = claseDofus.descripcion
        holder.dios_clase.text = "Dios: ${claseDofus.dios}"
        holder.tipo_clase.text = "Tipo: " + claseDofus.tipo
        holder.especialidad_clase.text = "Especialidad: "+claseDofus.especialidad

    }
}