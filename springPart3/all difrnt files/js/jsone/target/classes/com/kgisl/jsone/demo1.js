
var app = new function () {
 this.countries = ['France', 'Germany', 'England', 'Spain', 'Belgium', 'Italy', 'Portugal', 'Irland', 'Luxembourg'];
 // this.countries = [];
 this.updateItem="";

 this.FetchAll = function () {
   // alert("this.countries.length =" + this.countries.length);
   // this.data += '<table><tr><th>Name</th></tr>';
   var data = '';
   if (this.countries.length > 0) {
     for (i = 0; i < this.countries.length; i++) {

       data += '<tr>';
       data += '<td>' + this.countries[i] + '</td>';
       data += '<td><button onclick="app.Edit(' + i + ')">Edit</button></td>';
       data += '<td><button onclick="app.Delete(' + i + ')">Delete</button></td>';
       data += '</tr>';
     }
     // this.data += '<table>';
     console.log(data);
     document.getElementById("countriesList").innerHTML = data;
   }
 };

 this.Edit = function (item) {
   this.updateItem=item;
   document.getElementById('submit').value = "Update";
   document.getElementById('countryName').value = this.countries[item];
 };

 this.Delete = function (item) {
   alert(this.countries[item]);
   this.countries.splice(item, 1);
   app.FetchAll();
 };

 this.Add = function () {
   document.getElementById('countryName').value;
   // alert(document.getElementById('countryName').value);
   this.countries.push(document.getElementById('countryName').value);

   app.FetchAll();
 };
 this.AddorUpdate = function () {
   var action = document.getElementById('submit').value;
   if (action != "Update") {
     document.getElementById('countryName').value;
     this.countries.push(document.getElementById('countryName').value);
   }
   else {
     var updateCountry = document.getElementById('countryName').value;
     alert(updateCountry);
     this.countries.splice(this.updateItem, 1, updateCountry);
     this.updateItem="";
     document.getElementById('submit').value = "add";

   }


   app.FetchAll();
 };
}

// app.FetchAll();