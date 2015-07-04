$(document).ready(function(){	
	var message = $("body").find(".message")	
	if (message) {
		message.prepend("<a href='#' id='close'> X </a>");
	}
	
	$("#close").on("click", function(){
		$("body").find(".message").css("visibility","hidden");
	});
	
	$(".apenas-numero").on("keydown", function(event) {		
		var tecla = (window.event) ? event.keyCode : event.which;		
		var retorna;
		if ((tecla > 47 && tecla < 58) || tecla == 9 || (tecla > 95 && tecla < 106)) 
			retorna = true;
		else {
			if (tecla != 8) 
				retorna = false;
			else 
				retorna = true;
		}
		return retorna;
	});
	
	$(".apenas-valor").on("keydown", function(event) {		
		var tecla = (window.event) ? event.keyCode : event.which;		
		var retorna;
		if ((tecla > 47 && tecla < 58) || tecla == 9 || (tecla > 95 && tecla < 106) || tecla == 108) 
			retorna = true;
		else {
			if (tecla != 8) 
				retorna = false;
			else 
				retorna = true;
		}
		return retorna;
	});
		
	// Formulario de Sexo
	$("#form-sexo").on("submit", function(){
		
		var descricao = $("#form-sexo").find("#descricao");
		var validation = (descricao.val().trim() == "");				
		
		if (validation) {
			alert("preencha o campo descrição");
			descricao.focus();
		}		
		return (!validation);		
	});
	// End
	
	// Formulario de Religião
	$("#form-religiao").on("submit", function(){
		
		var descricao = $("#form-religiao").find("#descricao");
		var validation = (descricao.val().trim() == "");				
		
		if (validation) {
			alert("preencha o campo descrição");
			descricao.focus();
		}		
		return (!validation);		
	});
	// End
	
	// Formulario de Filiação
	$("#form-filiacao").on("submit", function(){
		
		var descricao = $("#form-filiacao").find("#descricao");
		var validation = (descricao.val().trim() == "");				
		
		if (validation) {
			alert("preencha o campo descrição");
			descricao.focus();
		}		
		return (!validation);		
	});
	// End
	
	// Formulario de Etnia
	$("#form-etnia").on("submit", function(){
		
		var descricao = $("#form-etnia").find("#descricao");
		var validation = (descricao.val().trim() == "");				
		
		if (validation) {
			alert("preencha o campo descrição");
			descricao.focus();
		}		
		return (!validation);		
	});
	// End
		
	// Formulario de Deficiencia
	$("#form-deficiencia").on("submit", function(){
		
		var descricao = $("#form-deficiencia").find("#descricao");
		var grau = $("#form-deficiencia").find("#grau");
		var validation = (descricao.val().trim() == "" || grau.val().trim() == "");				
		
		if (descricao.val().trim() == "") {
			alert("preencha o campo descrição");
			descricao.focus();
		} else
			if (grau.val().trim() == "") {
				alert("preencha o campo grau");
				grau.focus();
			}	
		
		return (!validation);		
	});
	// End
		
	// Formulario de Produto
	$("#form-produto").on("submit", function(){
		
		var descricao = $("#form-produto").find("#descricao");
		var local = $("#form-produto").find("#local");
		var validation = (descricao.val().trim() == "" || local.val().trim() == "");				
		
		if (descricao.val().trim() == "") {
			alert("preencha o campo descrição");
			descricao.focus();
		} else
			if (local.val().trim() == "") {
				alert("preencha o campo local");
				local.focus();
			}	
		
		return (!validation);		
	});
	// End
	
	// Formulario de Servico
	$("#form-servico").on("submit", function(){
		
		var descricao = $("#form-servico").find("#descricao");		
		var validation = (descricao.val().trim() == "");				
		
		if (descricao.val().trim() == "") {
			alert("preencha o campo descrição");
			descricao.focus();
		}	
		
		return (!validation);		
	});
	// End
});	