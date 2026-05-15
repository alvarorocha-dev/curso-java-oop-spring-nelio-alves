<script type='text/javascript'>
    const $ = jQuery;
    $.ajax({
        url: "https://appcor.cor-rio.work/estagio_cidade",
        type: "get",
        cache: false,
        dataType: "json",
        success: function (response) {
            //set the banner color
            // var x = document.querySelectorAll("#banner-stage");
            // x[0].style.setProperty("background-color", response.cor, "important");
            //set the banner status text
            var element = document.querySelector("#banner-stage-status h2");
            // var text = document.createTextNode(response.estagio);
            var imagemS = '1';
            if (response.estagio === "Estágio 2") {
                var imagemS = '2';
            }
            if (response.estagio === "Estágio 3") {
                var imagemS = '3';
            }
            if (response.estagio === "Estágio 4") {
                var imagemS = '4';
            }
            if (response.estagio === "Estágio 5") {
                var imagemS = '5';
            }
            element.innerHTML = '<img src="https://cor.rio/estagios/2025-painel-cor-estagio-0' + imagemS + '.png">';
            element.appendChild(text);
        }
    });

    </script>   