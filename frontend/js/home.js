const clienteLogado = localStorage.getItem("cliente");
const areaCliente = document.getElementById("area-cliente");

if (clienteLogado) {

    areaCliente.innerText = "👤 MINHA CONTA";
    areaCliente.href = "minha-conta.html";
} else {

    areaCliente.innerText = "👤 ENTRAR";
    areaCliente.href = "login.html";
}