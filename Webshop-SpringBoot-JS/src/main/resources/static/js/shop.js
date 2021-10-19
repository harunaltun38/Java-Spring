console.log("Hello world");

function zeige(item){
	"use strict";
	let name = item.getAttribute('title');
	let price = item.getAttribute('data-price');

	console.log(name);
	console.log(price);
	
}

function berechneGesamtPreis(item){
	"use strict"
	let price = item.getAttribute('data-price');
	let aktuellerPreis=document.querySelector(".cart-total-price");	
	let result=parseFloat(price)+parseFloat(aktuellerPreis.textContent);
	aktuellerPreis.textContent=result.toFixed(2);
	
}

function zeigeBestellungInWarenkorb(item){
	"use strict"
	let name = item.getAttribute('title');
	let price = item.getAttribute('data-price');
	let cartItems= document.querySelector('.cart-items');
	//if(cartItems.includes(name)){
	//	let NameFromItem=cartItems[cartItems.indexOf(name)];
	//	let div= document.createElement('div');
	//	let text= document.createTextNode(NameFromItem);
	//	div.appendChild(text);
	//}
	
	let span = document.createElement('span');
	let textNode= document.createTextNode(name);  //Für die Sichtbarkeit der Ausgabe
	//	span.setAttribute("class", "cart-item-name");    
	//	span.setAttribute("name", name);
	//	span.setAttribute("value",price);
	span.appendChild(textNode);
	cartItems.appendChild(span);
	
}