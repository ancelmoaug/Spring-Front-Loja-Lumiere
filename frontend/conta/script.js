const cliente = JSON.parse(localStorage.getItem("cliente"));

// 🔐 bloqueia acesso se não estiver logado
if (!cliente) {
  window.location.href = "login.html";
}

// ===== DADOS PESSOAIS =====
document.getElementById("nome").innerText =
  `${cliente.nome} ${cliente.sobrenome}`;

document.getElementById("cpf").innerText = cliente.cpf || "";

document.getElementById("dataNascimento").innerText =
  cliente.dataDeNascimento
    ? cliente.dataDeNascimento.split("-").reverse().join("/")
    : "";

document.getElementById("telefone").innerText =
  cliente.telefone?.numero || "";

// endereço formatado
if (cliente.endereco) {
  const e = cliente.endereco;
  document.getElementById("endereco").innerText =
    `${e.rua}, ${e.numero}${e.complemento ? " - " + e.complemento : ""}, ` +
    `${e.bairro}, ${e.municipio} - ${e.estado}, ${e.cep}`;
}

// ===== DADOS BANCÁRIOS =====
if (cliente.dadosBancarios) {
  document.getElementById("agencia").innerText =
    cliente.dadosBancarios.codigoAgencia;

  document.getElementById("conta").innerText =
    cliente.dadosBancarios.numeroConta;

  // código do banco (ex: 001 = Banco do Brasil)
  document.getElementById("banco").innerText =
    cliente.dadosBancarios.codigoBanco;
}

// ===== AÇÕES =====
const notificacao = document.querySelector(".notificacao");

function mostrarNotificacao(mensagem) {
  if (!notificacao) return;

  notificacao.textContent = mensagem;
  notificacao.classList.add("ativa");

  setTimeout(() => {
    notificacao.classList.remove("ativa");
  }, 3000);
}

// botões editar / sair
document.querySelectorAll(".actions button").forEach(botao => {
  botao.addEventListener("click", () => {
    if (botao.id === "sair") {
      localStorage.removeItem("cliente");
      window.location.href = "login.html";
      return;
    }
    mostrarNotificacao("Ação realizada com sucesso.");
  });
});

// adicionar cartão
document.querySelector(".add")?.addEventListener("click", () => {
  mostrarNotificacao("Novo cartão adicionado.");
});

// excluir cartão
document.querySelectorAll(".trash").forEach(botao => {
  botao.addEventListener("click", () => {
    botao.closest(".card").remove();
    mostrarNotificacao("Cartão removido.");
  });
});

