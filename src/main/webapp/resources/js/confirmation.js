load = function() {
    $.getJSON('/application', function (data) {
        $('#info').text(JSON.stringify(data));
    });
};

setTimeout(load, 2000);