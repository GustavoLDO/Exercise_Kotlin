package br.edu.fatecpg.appmvvm.viewmodel

import androidx.lifecycle.ViewModel
import br.edu.fatecpg.appmvvm.model.Usuario

class LoginViewModel : ViewModel()  {
    private val usuarios = mutableListOf<Usuario>()

    fun login(email: String, senha: String): String{

        val usuario = usuarios.find { it.email == email && it.senha == senha }

        return if (usuario != null) {
            "Login bem-sucedido"
        } else {
            "Credenciais inválidas"

        }
    }

    fun cadastrar(email: String, senha: String): String {

        val usuario = Usuario(email, senha)

        usuarios.add(usuario)

        return "Cadastro bem-sucedido"

    }



}