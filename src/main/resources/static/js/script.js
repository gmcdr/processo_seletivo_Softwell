$(document).ready(function () {
    $("#celular").mask("(00) 00000-0000")
    $("#cpf").mask("000.000.000-00")
    $("#rg").mask("00.000.000-00")
})

function error() {
    Swal.fire({
        icon: 'error',
        title: 'Oops...',
        text: 'Você não possui idada suficiente para se cadastrar !',
      })
}

function verificarIdade() {
    var dataHtml = document.getElementById("data").value;
    var ano_atual = new Date().getFullYear();
    const myArray = dataHtml.split("-");
    var ano_informado = myArray[0];
    var idade = ano_atual - ano_informado;

    if (idade < 17) {
        error()
        document.getElementById("data").value = "";
    }
}

