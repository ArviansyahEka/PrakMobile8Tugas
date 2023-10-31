import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.prakmobile8tugas.Hero
import com.example.prakmobile8tugas.R

class HeroAdapter(private val heroList: List<Hero>) :
    RecyclerView.Adapter<HeroAdapter.HeroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.hero_item, parent, false)
        return HeroViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        val currentItem = heroList[position]
        holder.imageView.setImageResource(currentItem.image)
        holder.textView.text = currentItem.name
    }

    override fun getItemCount(): Int {
        return heroList.size
    }

    class HeroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}
