/**
 * Created by DOSI on 17/02/2017.
 */
angular.module('app').controller('EnseignantUpdateCtrl', ['$scope','$routeParams','ServiceEnseignant' ,function ($scope,$routeParams,ServiceEnseignant) {


    ServiceEnseignant.getOneEnseignant($routeParams.noEnseignant,function (data) {
        $scope.enseignant = data;
        console.log($scope.enseignant);
    });
    $scope.updateEnseignant=function() {
        $scope.enseignant["Content-Type"] = "application/json";
        ServiceEnseignant.updateEnseignant($scope.enseignant);

    }





}]);