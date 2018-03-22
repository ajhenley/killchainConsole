$(function() {
    $('body').terminal(function(command, term) {
        return $.post('/datas', {command: command});
    }, {
        greetings: 'Killchain v0.1'
    });
});
