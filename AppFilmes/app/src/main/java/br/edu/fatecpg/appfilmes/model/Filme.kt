package br.edu.fatecpg.appfilmes.model

import java.security.KeyStore.TrustedCertificateEntry

data class Filme(

    var nome:String,
    var genero:String,
    var assistido: Boolean = false,
    var nota: Double

)
