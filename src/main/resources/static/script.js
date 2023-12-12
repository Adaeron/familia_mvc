const armas=[];
const titulos=[];

function armasAJson(){
    const armasAux = [];

    armas.forEach((arma) => {
        armasAux.push({"tipo" : arma});
    })

    return armasAux;
}

function titulosAJson(){
    const titulosAux = [];

    titulos.forEach((titulo) => {
        titulosAux.push({"descripcion" : titulo})
    })

    return titulosAux;
}

function tieneCargoPolitico(){
    const checkBoxCargo = document.getElementById('cargoPolitico');
    const isChecked = Boolean(checkBoxCargo.checked, true);

    return isChecked;
}

function addArma(){
    const listaDeArmas = document.getElementById('listaDeArmas')
    const armaSeleccionada = document.getElementById('selectArmas').value;

    //Agregar arma al array
    armas.push(armaSeleccionada);
    
    //Limpio el listado que se muestra
    listaDeArmas.innerHTML='';

    //Agrego cada arma del array al listado de armas.
    armas.forEach((arma) => {
        const opcion = document.createElement('option');
        opcion.value = arma;
        opcion.textContent = arma;
        listaDeArmas.appendChild(opcion)
    })
}

function deleteArma(){
    const listaDeArmas = document.getElementById('listaDeArmas');
    const armaSeleccionada = document.getElementById('listaDeArmas').value;

    armas.splice(armas.indexOf(armaSeleccionada), 1);
    
    listaDeArmas.innerHTML='';

    armas.forEach((arma) => {
        const opcion = document.createElement('option');
        opcion.value = arma;
        opcion.textContent = arma;
        listaDeArmas.appendChild(opcion)
    })
}

function addTitulo(){
    const listaDeTitulos = document.getElementById('listaDeTitulos');
    const nombreTitulo = document.getElementById('descripcionTitulo').value;

    titulos.push(nombreTitulo);

    listaDeTitulos.innerHTML='';

    titulos.forEach((titulo) => {
        const opcion = document.createElement('option');
        opcion.value = titulo;
        opcion.textContent = titulo;
        listaDeTitulos.appendChild(opcion);
    })
}

function addCriminal(){
    const form = document.getElementById('formCriminal');
    
    form.addEventListener('submit', function(e){
        e.preventDefault();

        axios.post('http://localhost:8080/familia/integrantes/agregarCriminal',{
            "nombre":document.getElementById('nombreCriminal').value,
            "idIntegrante": document.getElementById('idCriminal').value,
            "puntosDeHonorBase":document.getElementById('honorBaseCriminal').value,
            "armas": armasAJson()
        })
            .then(response => console.log(response))
            .catch(error => console.log(error))
    })
}

function addRespetable(){
    const form = document.getElementById('formRespetable');

    form.addEventListener('submit', function(e){
        e.preventDefault();
        axios.post('http://localhost:8080/familia/integrantes/agregarRespetable', {
            "nombre":document.getElementById('nombreRespetable').value,
            "idIntegrante": document.getElementById('idRespetable').value,
            "puntosDeHonorBase":document.getElementById('honorBaseRespetable').value,
            "tieneCargoPolitico": tieneCargoPolitico(),
            "titulos": titulosAJson()
        })
        .then(response => console.log(response))
        .catch(error => console.log(error))        
    })
}


async function getIntegrantes() {
    try{
        const response = await axios.get(
            "http://localhost:8080/familia/integrantes/listar"
        );

        const integrantes = response.data;
        
        const tablaIntegrantes = document.getElementById('tablaIntegrantes');
        
        //Vacío la tabla.
        tablaIntegrantes.innerHTML="";
        
        //Genero las columnas con las claves del primer dato que contiene el JSON response.
        const columnas = Object.keys(integrantes[0]);
        
        //Crea el header de la tabla.
        const thead = document.createElement("thead");
        const tr = document.createElement("tr");

        //Recorro los datos del pimer elemento del JSON para nombrar
        //cada celda.
        columnas.forEach((dato) =>{
            const th = document.createElement("th");
            th.innerText = dato; //Nombro la columna con el nombre de cada dato.
            tr.appendChild(th); //Agrego la celda a la fila de cabecera.
        })

        thead.appendChild(tr);
        tablaIntegrantes.appendChild(tr);

        //Recorro el JSON para crear cada fila 
        integrantes.forEach((integrante) =>{
            //Creo una fila
            const tr = document.createElement("tr");
            //Guardo los valores que tenga el integrante
            const valores = Object.values(integrante);
            //Recorro los valores para crear cada celda
            valores.forEach((valor) =>{
                //Creo una celda
                const td = document.createElement("td");
                //Asigno el valor del dato a la celda.
                td.innerText = valor;
                //Agrego la celda a la fila.
                tr.appendChild(td);
            });
            //Agrego la fila a la tabla.
            tablaIntegrantes.appendChild(tr);
        });
        console.log(integrantes);
    }catch(error){
        console.log(error);
    }
    
}