$(function() {
    $('body').terminal(function(command, term) {
        return $.post('/datas', {command: command,
                                 gameid: document.getElementById("gameid").value,
                                 gamehash: document.getElementById("gamehash").value});
    }, {
        greetings: 'Killchain v0.1'
    });
});