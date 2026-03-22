package br.edu.fatecpg.appfilmes.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.appfilmes.R
import br.edu.fatecpg.appfilmes.model.Filme
import br.edu.fatecpg.appfilmes.model.FilmeDaoImpl
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    // Instância do DAO para persistência em memória/banco
    private val dao = FilmeDaoImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Ajuste no padding para as System Bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val edtNomeFilme: EditText = findViewById(R.id.edt_nome)
        val edtGenero: EditText = findViewById(R.id.edt_genero)
        val btnCadastrar: Button = findViewById(R.id.btn_cadastrar)
        val fabAvanca: FloatingActionButton = findViewById(R.id.fab_avanca)

        btnCadastrar.setOnClickListener {
            val nomeFilme = edtNomeFilme.text.toString()
            val genero = edtGenero.text.toString()

            if (nomeFilme.isNotEmpty() && genero.isNotEmpty()) {
                // Criamos o objeto conforme o enunciado: Nome, Gênero e padrões
                val filme = Filme(
                    nome = nomeFilme,
                    genero = genero,
                    assistido = false, // Começa como não assistido
                    nota = 0.0         // Nota inicial zerada
                )

                // Envia para o DAO (que será lido pela ListaActivity)
                dao.postFilme(filme)

                Toast.makeText(this, "Título cadastrado com sucesso!", Toast.LENGTH_SHORT).show()

                // Limpa os campos após o cadastro
                edtNomeFilme.text.clear()
                edtGenero.text.clear()
            } else {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            }
        }

        // Navegação para a ListaActivity (onde o Adapter vai agir)
        fabAvanca.setOnClickListener {
            val intent = Intent(this, ListaActivity::class.java)
            startActivity(intent)
        }
    }
}