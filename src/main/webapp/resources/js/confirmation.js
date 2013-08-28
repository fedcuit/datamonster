load = function() {
    $.getJSON('/application', function (data) {
        $('#info').text(data);
    });
};

setTimeout(load, 3000);