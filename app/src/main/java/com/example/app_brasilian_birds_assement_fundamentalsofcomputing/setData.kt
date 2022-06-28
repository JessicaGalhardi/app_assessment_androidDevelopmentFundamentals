package com.example.app_brasilian_birds_assement_fundamentalsofcomputing

object setData {

    fun SetBirds():List<BirdsData> {

        var BirdsList = mutableListOf<BirdsData>()
        BirdsList.add(
            BirdsData(
                1,
                "Papagaio",
                "O conversador",
                "Pode viver até 80 anos",
                "Pesando 400 gramas esse esperto bichinho pode atingir até 45cm.Encontrado no Paraguai, Bolívia,Argentina e Brasil, esse passáro pode viver por até 80 anos e tem quem diga até que eles falem, mas a verdade é que são capazes de reproduzir sons que ouvem e podem até cantar como um ser humano."
            )
        )
        BirdsList.add(
            BirdsData(
                2,
                "Tucano",
                "O apaixonado",
                "Aquele do cereal",
            "Acredita-se que existam mais de 22 espécies desse simpático bichinho, que vivem em florestas e lugares de clima tropical, incluindo a Amazônia. Seu bico pode chegar a 22cm e como casais eles tem habitos muito parecidos com os seres humanos, já que passam a vida toda com o mesmo parceiro.Apesar de ser um passáro de países tropicais, ele com suas lindas cores e simpatia se tornou garoto propaganda do famoso cereal americano Fruit Loops"
            )
        )
        BirdsList.add(
            BirdsData(
                3,
                "Arara",
                "Não sabe voar?",
                "Assexuadas?",
                " Ela encanta com suas cores marcantes e pode ser encontrada em azul, vermelho e amarelo. No Brasil, existem 13 espécies diferentes desse lindo passáro.Elas não são boas voadoras, por isso o formato dos seus pés ajuda a escalar árvores e uma caracteristica curiosa é que só é possível saber o sexo de uma arara através de um exame de sangue."
            )
        )

        BirdsList.add(
            BirdsData(
                4,
                "Beija-flor",
                "Grande coração",
                "Pequenininho",
                "O beija-flor é uma ave das Américas e é o menor passáro do mundo.No Brasil pode ser chamado de guinumbi,pica-flor e cuitelo.\n" +
                        "Uma curiosidade é que seu coração representa 5% do seu peso.\n"
            )
        )



        return BirdsList
    }
}
