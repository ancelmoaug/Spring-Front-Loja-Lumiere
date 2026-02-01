
const notificacao = document.querySelector(".notificacao");

function mostrarNotificacao(mensagem) {
  notificacao.textContent = mensagem;
  notificacao.classList.add("ativa");

  setTimeout(() => {
    notificacao.classList.remove("ativa");
  }, 3000);
}


const botoes = document.querySelectorAll(".actions button");

botoes.forEach(botao => {
  botao.addEventListener("click", () => {
    mostrarNotificacao("Ação realizada com sucesso.");
  });
});


const botaoAdicionar = document.querySelector(".add");

if (botaoAdicionar) {
  botaoAdicionar.addEventListener("click", () => {
    mostrarNotificacao("Novo item adicionado.");
  });
}

const botoesExcluir = document.querySelectorAll(".trash");

botoesExcluir.forEach(botao => {
  botao.addEventListener("click", () => {
    const card = botao.closest(".card");
    card.remove();
    mostrarNotificacao("Item removido.");
  });
});
