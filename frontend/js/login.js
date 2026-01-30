document.getElementById("loginForm").addEventListener("submit", async function (e) {
    e.preventDefault();

    const email = document.getElementById("email").value;
    const senha = document.getElementById("senha").value;

    try {
        const response = await fetch("http://localhost:8080/auth/login", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({ email, senha })
        });

        if (!response.ok) {
            throw new Error("Login inválido");
        }

        const cliente = await response.json();

        localStorage.setItem("cliente", JSON.stringify(cliente));

        window.location.href = "../index.html";

    } catch (error) {
        document.getElementById("mensagemErro").innerText =
            "Email ou senha incorretos!";
    }
});
