/*
$.ajax({
    type: 'get',
    url: 'a.action',
    dataType:"JSON",
    success: function (data) {
        var source   = $("#entry-template").html();
        var template = Handlebars.compile(source);

        Handlebars.registerHelper("myCount" , function(index){
            return index + 1 ;
        });
        var html=template(data.obj);
        document.getElementById("product-table-tepl").innerHTML = html;
    }
});*/
