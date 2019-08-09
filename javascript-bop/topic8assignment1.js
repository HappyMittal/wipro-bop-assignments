var CD=
    {
		name:"Ghost Stories",
		publisher:"Coldplay",
		price:299,
		displayDetails: function(){ return this.name+" "+this.publisher+" "+(this.price+0.1*this.price-0.03*this.price)}
    }
CD.displayDetails()