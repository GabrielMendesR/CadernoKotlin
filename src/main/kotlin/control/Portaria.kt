package control

import business.ConvidadoBusiness
import entity.Convite

class Portaria {

    private val convidadoBusiness = ConvidadoBusiness()

    init {
        println("Portaria Inicializada")
        println(controle())
    }

    private fun controle(): String {

        val idade = Console.readInt("Qual a Sua Idade? ")

        if (!convidadoBusiness.maiorDeIdade(idade)) {
            return "Acesso Negado! Menor de Idade"
        }

        val convite = Convite(Console.readString("Informe o Tipo de Convite? ").lowercase(),
            Console.readString("Informe o Código Do Convite? ").lowercase())

        if (!convidadoBusiness.validaTipo(convite)) {
            return "Acesso Negado! Tipo de Convite Inválido"
        }

        if (!convidadoBusiness.validaCodigo(convite)) {
            return "Acesso Negado! Código do Convite Inválido"
        }

        return "Acesso Autorizado! Bem Vindo :)"
    }
}