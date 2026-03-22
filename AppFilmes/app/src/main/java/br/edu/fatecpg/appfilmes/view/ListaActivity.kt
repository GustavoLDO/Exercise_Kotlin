package br.edu.fatecpg.appfilmes.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.appfilmes.R
import br.edu.fatecpg.appfilmes.adapter.FilmeAdapter
import br.edu.fatecpg.appfilmes.model.FilmeDaoImpl
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity : AppCompatActivity(R.layout.activity_lista) {
    private val dao = FilmeDaoImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvFilme:RecyclerView = findViewById(R.id.rv_filmes)
        val filmes = dao.getFilme()

        rvFilme.layoutManager =LinearLayoutManager(this)
        rvFilme.adapter =FilmeAdapter(filmes)


        // Dentro do onCreate da ListaActivity
        val fabVoltar: FloatingActionButton = findViewById(R.id.fab_voltar_cadastro)

        fabVoltar.setOnClickListener {

            finish()
        }

    }
}