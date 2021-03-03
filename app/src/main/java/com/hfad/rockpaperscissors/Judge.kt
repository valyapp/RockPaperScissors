package com.hfad.rockpaperscissors

class Judge() {

    fun getResult(gameChoose: String, userChoose: String): String {

        var result: String
        if (gameChoose == userChoose) {
            result = "Ничья!"
        } else if (
            (userChoose == "Ножницы" && gameChoose == "Бумага") ||
            (userChoose == "Бумага" && gameChoose == "Камень") ||
            (userChoose == "Камень" && gameChoose == "Ножницы")
        ) {
            result = "Ты победил!\n\n Ты выбрал\n \"$userChoose\"\n\n а компьютер выбрал\n \"$gameChoose\""
        } else {
            result = "Ты проиграл.\n\n Ты выбрал\n \"$userChoose\"\n\n а компьютер выбрал\n \"$gameChoose\""

        }
        return result
    }


}
