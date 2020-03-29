package io.github.howiezuo.designsystem

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import io.github.howiezuo.designsystem.component.Card

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        ThemeManager.setThemeOverlay(this)

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        findViewById<RecyclerView>(R.id.recycler_photos)?.adapter = PhotoAdapter()
    }

    inner class PhotoAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            return PhotoViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.row_card, parent, false)
            )
        }

        override fun getItemCount() = mockedPhotos.count()

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            (holder as PhotoViewHolder).bind(mockedPhotos[position])
        }
    }

    class PhotoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: Pair<Int, User>) {
            val card = itemView.findViewById<Card>(R.id.card)
            card.setAvatar(item.second.icon)
            card.setName(item.second.name)
            card.setPhoto(item.first)
        }
    }

    val mockedPhotos = listOf(
        Pair(
            R.drawable.photo1,
            User("Dianna Smiley", R.drawable.avatar1)
        ),
        Pair(
            R.drawable.photo2,
            User("Alex Lee", R.drawable.avatar2)
        )
    )

    data class User(
        val name: String,
        val icon: Int
    )
}
