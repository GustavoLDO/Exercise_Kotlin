package br.edu.fatecpg.appmvvm.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.appmvvm.R
import br.edu.fatecpg.appmvvm.databinding.ActivityMainBinding
import br.edu.fatecpg.appmvvm.viewmodel.LoginViewModel


class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val vm = LoginViewModel()

        binding.btnLogin.setOnClickListener {
            val email = binding.edtEmail.text.toString()
            val senha = binding.edtPassword.text.toString()
            val retorno = vm.login(email,senha )
            Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show()

        }

        binding.tvRegister.setOnClickListener {
            val email = binding.edtEmail.text.toString()
            val senha = binding.edtPassword.text.toString()
            val retorno = vm.cadastrar(email,senha )
            Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show()

        }


    }
}