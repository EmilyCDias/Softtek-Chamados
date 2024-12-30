
function classificarChamado() {
    const input = document.getElementById('classificacaoInput').value;
    const resultado = document.getElementById('classificacaoResultado');
    // Simulação de classificação
    resultado.textContent = "Classificação: " + (input ? "Alta" : "Baixa");
}

function atribuirChamado() {
    const resultado = document.getElementById('atribuicaoResultado');
    const complexidade = prompt("Digite a complexidade do chamado (Baixa, Média, Alta):");

    let consultor = "Técnico Nível 1";
    if (complexidade === "Alta") {
        consultor = "Técnico Nível 3";
    } else if (complexidade === "Média") {
        consultor = "Técnico Nível 2";
    }

    resultado.textContent = `Chamado atribuído ao ${consultor} com base na complexidade '${complexidade}'.`;
}


function enviarNotificacao() {
    const mensagem = prompt("Digite a mensagem da notificação:");
    const resultado = document.getElementById('notificacaoResultado');

    if (mensagem) {
        resultado.textContent = `Notificação enviada com sucesso! Mensagem: "${mensagem}"`;
    } else {
        resultado.textContent = "Falha ao enviar a notificação. Nenhuma mensagem fornecida.";
    }
}


// Gráfico 
const ctx = document.getElementById('chamadosChart').getContext('2d');
const chamadosChart = new Chart(ctx, {
    type: 'line',
    data: {
        labels: ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun'],
        datasets: [{
            label: 'Número de Chamados',
            data: [12, 19, 3, 5, 2, 3],
            backgroundColor: 'rgba(32, 178, 170, 0.2)',
            borderColor: '#20B2AA',
            borderWidth: 1
        }]
    },
    options: {
        scales: {
            y: {
                beginAtZero: true
            }
        }
    }
});


