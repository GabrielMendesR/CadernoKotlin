package control

import business.ConviteBusiness

class Portaria {

    private val conviteBusiness = ConviteBusiness()

    init {
        println("Portaria Inicializada")
        println(controle())
    }

    private fun controle(): String {

        val idade = Console.readInt("Qual a Sua Idade? ")

        if (idade < 18) {
            return "Acesso Negado! Menor de Idade"
        }

        val tipoConvite = Console.readString("Qual o Tipo de Convite? ")
        conviteBusiness.tipoValido(tipoConvite)


        return "Bem Vindo :)"
    }
}