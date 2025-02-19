const consultores = [
    { consultor: 'Fra', senioridade: 'Pr', complexidade: 'N1', valor: 15.00 },
    { consultor: 'Fra', senioridade: 'Ex', complexidade: 'N2', valor: 14.32 },
    { consultor: 'Fra', senioridade: 'Sr', complexidade: 'N2', valor: 90.00 },
    { consultor: 'Ith', senioridade: 'Jr', complexidade: 'N2', valor: 80.00 },
    { consultor: 'Jos', senioridade: 'Sr', complexidade: 'N1', valor: 25.00 },
];

function filtrarConsultores() {
    const senioridade = document.getElementById('senioridade').value;
    const complexidade = document.getElementById('complexidade').value;
    const custo = parseFloat(document.getElementById('custo').value);

    let filtrados = consultores;

    if (senioridade) {
        filtrados = filtrados.filter(c => c.senioridade === senioridade);
    }

    if (complexidade) {
        filtrados = filtrados.filter(c => c.complexidade === complexidade);
    }

    if (!isNaN(custo)) {
        filtrados = filtrados.filter(c => c.valor <= custo);
    }

    mostrarConsultores(filtrados);
}

function mostrarConsultores(lista) {
    const tbody = document.querySelector('#consultores-table tbody');
    tbody.innerHTML = '';

    lista.forEach(consultor => {
        const tr = document.createElement('tr');

        Object.values(consultor).forEach(text => {
            const td = document.createElement('td');
            td.textContent = text;
            tr.appendChild(td);
        });

        tbody.appendChild(tr);
    });
}

mostrarConsultores(consultores);

const ociosidadeDados = {
    labels: ['Fra', 'Ma', 'Jhon', 'João', 'Maria'],
    datasets: [{
        label: 'Horas Ociosas',
        data: [10, 20, 15, 5, 25],
        backgroundColor: 'rgba(75, 192, 192, 0.2)',
        borderColor: 'rgba(75, 192, 192, 1)',
        borderWidth: 1
    }]
};

const config = {
    type: 'bar',
    data: ociosidadeDados,
    options: {
        scales: {
            y: {
                beginAtZero: true
            }
        },
        plugins: {
            title: {
                display: true,
                text: 'Ociosidade por Consultor',
                font: {
                    size: 18
                }
            }
        }
    }
};

const ociosidadeChart = new Chart(
    document.getElementById('ociosidadeChart'),
    config
);

