/**
 * Created by DOSI on 16/02/2017.
 */
'use strict';


angular.module('app').controller('EnseignantCtrl', ['$scope','$routeParams','$http','ServiceEnseignant',function ($scope,$routeParams,$http, ServiceEnseignant) {

    $scope.enseignants = [];

    ServiceEnseignant.getAllEnseignant(function (data) {
        $scope.enseignants = data;

    });
    $scope.deleteEnseignant=function (noEnseignant) {
        console.log('hh');
        ServiceEnseignant.deleteEnseignant(noEnseignant);
    }

}]);